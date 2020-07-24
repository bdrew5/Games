import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

public class MyGames extends Application {
    public void start(Stage stage) {

        Button minesweeperB = new Button("Minesweeper");
        minesweeperB.setOnAction(this::processMinesweeper);

        Button zombieDiceB = new Button("Zombie Dice");
        zombieDiceB.setOnAction(this::processZombieDice);

        Button tikTakToe = new Button("tikTakToe");
        tikTakToe.setOnAction(this::processTikTakToe);

        FlowPane pane = new FlowPane(minesweeperB, zombieDiceB, tikTakToe);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("My Games");
        stage.setScene(scene);
        stage.show();
    }

    private void processZombieDice(ActionEvent event1) {
        Scene scene = new Scene(new ZombieDieGUI(), 10000, 10000);
        Stage stage = new Stage();
        stage.setTitle("Zombie Die");
        stage.setScene(scene);
        stage.show();
    }
    private void processMinesweeper(ActionEvent event2) {
        Scene scene = new Scene(new MinesweeperGUI(), 10000, 10000);
        Stage stage = new Stage();
        stage.setTitle("Minesweeper");
        stage.setScene(scene);
        stage.show();
    }
    private void processTikTakToe(ActionEvent event3) {
        Scene scene = new Scene(new TikTakToe(), 10000, 10000);
        Stage stage = new Stage();
        stage.setTitle("Minesweeper");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}