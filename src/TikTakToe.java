import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import java.awt.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.shape.*;

public class TikTakToe extends GridPane {
    Font f1 = new Font(40);
    Font f2 = new Font(12);
    private Button[][] grid = new Button[3][3];
    private Button newGame;
    private Label[][] field;
    private int p1Wins;
    private int p2Wins;
    private Label numBombsLabel;
    private Label win1;
    private Label win2;
    private int player;

    public TikTakToe() {

        player =1;
        win1 = new Label("Player 1 Wins");
        win1.setVisible(false);
        win1.setFont(f2);
        win1.setTextFill(Color.WHITE);

        win2 = new Label("Player 2 Wins");
        win2.setVisible(false);
        win2.setFont(f2);
        win2.setTextFill(Color.WHITE);

        Line across1 = new Line(1, 1, 150, 1);
        across1.setStrokeWidth(1);
        Line across2 = new Line(1, 3, 150, 3);
        across2.setStrokeWidth(1);
        Line down1 = new Line(2, 1, 2, 120);
        down1.setStrokeWidth(1);
        Line down2 = new Line(4, 1, 4, 120);
        down2.setStrokeWidth(1);


        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = new Button("");
                grid[x][y].setOnAction(this::processClick);
                 field[x][y].setVisible(false);
                field[x][y].setText(" ");
            }
        }
        newGame = new Button("Reset");
        //newGame.setOnAction(this::processReset);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: white");


        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                add(grid[x][y], (x*2) + 1, y * 2);
                add(field[x][y], (x*2) + 1, y * 2);
            }
        }
        add(newGame, 0, 0);
        add(across1, 1, 1, 5,1);
        add(across2, 1, 3, 5, 1);
        add(down1, 2, 0,1,5);
        add(down2, 4, 0,1,5);
        //add(win1, 2, 5);
        //add(win2, 2, 5);
    }
    private void processClick(ActionEvent event1){
        int positionX = 0;
        int positionY = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if(grid[x][y].equals(event1.getSource())) {
                    positionX = x;
                    positionY = y;
                    grid[x][y].setVisible(false);
                    if(player%2 ==0){
                        field[x][y].setText("O");
                    }
                    else
                        field[x][y].setText("X");
                }
            }
        }

    }
}