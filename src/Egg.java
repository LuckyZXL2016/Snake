import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Egg {
	
	int row,col;
	int w = Yard.BLOCK_SIZE;
	int h = Yard.BLOCK_SIZE;
	// 产生随机数，显示位置
	private static Random r = new Random();        
	private Color color = Color.GREEN;
	
	public Egg(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	// 随机显示鸡蛋位置
	public Egg() {
		this(r.nextInt(Yard.ROWS-2) + 2,r.nextInt(Yard.COLS));
		
	}
	
	public void reAppear() {
		this.row = r.nextInt(Yard.ROWS-2) + 2;
		this.col = r.nextInt(Yard.COLS);
	}
	
	public Rectangle getRect() {
		return new Rectangle(Yard.BLOCK_SIZE * col, Yard.BLOCK_SIZE * row, w, h);
	}
	
	public void draw(Graphics g){
		Color c = g.getColor();
		g.setColor(color);
		// 填充外接指定矩形框的椭圆
		g.fillOval(Yard.BLOCK_SIZE * col, Yard.BLOCK_SIZE * row, w, h);  
		g.setColor(c);
		if(color == Color.GREEN) color = Color.RED;
		else color = Color.GREEN;
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
}
