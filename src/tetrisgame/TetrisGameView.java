package tetrisgame;

import java.awt.Color;

public class TetrisGameView {
	private TetrisGameModel tetrisgamemodel;
	private TetrisGameController tetrisgamecontroller;
	private Color[][] well;
	
	
	// Creates a border around the well and initializes the dropping piece
	private void init() {
		well = new Color[12][24];
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 23; j++) {
				if (i == 0 || i == 11 || j == 22) {
					well[i][j] = Color.GRAY;
				} else {
					well[i][j] = Color.BLACK;
				}
			}
		}
		tetrisgamemodel.newPiece();
	}
		
	public Color[][] getWell(){
		return well;
	}
	
	public void setWell(Color[][] well){
		this.well = well;
	}
	
}
