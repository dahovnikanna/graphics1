package com.example.demo;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class VolumeDice extends Application {

    private final double cameraModifier = 50.0;
    private final double cameraQuantity = 10.0;

    public void show() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Camera camera = new PerspectiveCamera(true);
        camera.setFarClip(50000.0);
        camera.setTranslateZ(-1000);

        // создание куба - параметры
        Box box = new Box(100, 100, 100);
        PhongMaterial greyMaterial = new PhongMaterial();
        greyMaterial.setDiffuseColor(Color.GRAY);
        greyMaterial.setSpecularColor(Color.DARKGREY);
        box.setMaterial(greyMaterial);

        // наклон
        box.setRotationAxis(Rotate.X_AXIS);
        box.setRotate(25);

        // камера
        Group group = new Group();
        group.getChildren().add(box);
        Scene scene = new Scene(group, 500, 300);
        scene.setCamera(camera);

        scene.setOnMouseClicked(mouseEvent -> {
            Node picked = mouseEvent.getPickResult().getIntersectedNode();
            if (null != picked) {
                double scalar = 2;
                if (picked.getScaleX() > 1)
                    scalar = 1;
                picked.setScaleX(scalar);
                picked.setScaleY(scalar);
                picked.setScaleZ(scalar);
            }
        });

        // события на кнопки: w,s,a,d
        scene.setOnKeyPressed(keyEvent -> {
            double change = cameraQuantity;
            if (keyEvent.isShiftDown()) {
                change = cameraModifier;
            }
            KeyCode keyCode = keyEvent.getCode();
            if (keyCode == KeyCode.W) {
                camera.setTranslateZ(camera.getTranslateZ() + change);
            }
            if (keyCode == KeyCode.S) {
                camera.setTranslateZ(camera.getTranslateZ() - change);
            }
            if (keyCode == KeyCode.A) {
                camera.setTranslateX(camera.getTranslateX() - change);
            }
            if (keyCode == KeyCode.D) {
                camera.setTranslateX(camera.getTranslateX() + change);
            }
        });


        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
