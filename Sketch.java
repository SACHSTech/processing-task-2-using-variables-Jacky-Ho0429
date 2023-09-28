import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	//Sets Size Of Canvas
    size(500, 500);
  }

  //Sets Up Inital Setup
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Draws A House on A Patch Of Grass (No Car)
   */
  public void draw() {
   background(220);
  
   // House
   stroke(0);
   fill(240, 250, 190);
   rect((float)(width / 16), (float)(height / 1.38), (float)(width / 3.34), (float)(height/4));
  
   // Roof
   fill(210, 100, 75);
   triangle(0, (float)(height / 1.38), (float)(width / 2.35), (float)(height / 1.38), (float)(width / 4.71), (float)(height / 1.86));
    
   // Window
   stroke(255);
   fill(140, 220, 240);
   rect((float)(width / 8), (float)(height / 1.23), (float)(width / 13.33), (float)(width / 13.33));
   line((float)(width / 6.15), (float)(height / 1.23), (float)(width / 6.15), (float)(height / 1.13));
   line((float)(width / 8), (float)(height / 1.18), (float)(width / 5), (float)(height / 1.18));
    
   // Door
   stroke(0);
   fill(170, 105, 50);
   rect((float)(width / 4.12), (float)(height / 1.18), (float)(width / 16), (float)(height / 8));
   stroke(255, 140, 105);
   fill(255, 140, 105);
   ellipse((float)(width / 3.48), (float)(height / 1.10), (float)(width / 133.33), (float)(width / 133.33));
   
   // Grass
   stroke(50, 170, 65);
   fill(50, 170, 65);
   rect(0, (float)(height/1.03), width, (float)(height/1.03));
  }
  // define other methods down here.
}