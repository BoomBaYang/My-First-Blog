package action;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import tree.BinaryTree;

public class layout extends Application {
	String[] prelist = { "A", "B", "C", null, null, "D", "E", null, "G", null, null, "F", null, null, null };
	BinaryTree<String> bitree = new BinaryTree<String>(prelist);

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane bpane = new GridPane();

		Label l1 = new Label("递归");
		Label l2 = new Label("非递归");

		Button b1 = new Button("先根遍历");
		Button b2 = new Button("中根遍历");
		Button b3 = new Button("后根遍历");
		Button b4 = new Button("先根遍历");
		Button b5 = new Button("中根遍历");

		bpane.add(l1, 0, 0);
		bpane.add(l2, 0, 3);
		bpane.add(b1, 1, 0);
		bpane.add(b2, 1, 1);
		bpane.add(b3, 1, 2);
		bpane.add(b4, 1, 3);
		bpane.add(b5, 1, 4);

		bpane.setHgap(10);
		bpane.setVgap(10);
		bpane.setAlignment(Pos.CENTER);

		b1.setOnAction(e -> {
			System.out.println("先根遍历：");
			bitree.preOrder();
		});
		b2.setOnAction(e -> {
			System.out.println("中根遍历：");
			bitree.inOrder();
		});
		b3.setOnAction(e -> {
			System.out.println("后根遍历：");
			bitree.postOrder();
		});
		b4.setOnAction(e -> {
			System.out.println("先根遍历：");
			bitree.preOrderT();
		});
		b5.setOnAction(e -> {
			System.out.println("中根遍历：");
			bitree.inOrderT();
		});

		Scene scene = new Scene(bpane, 300, 260);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tree");
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
