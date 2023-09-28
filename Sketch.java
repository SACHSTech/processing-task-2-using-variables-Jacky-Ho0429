import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	//Sets Size Of Canvas
    size(400, 400);
  }

  //Sets Up Inital Setup
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Draws A House on A Patch Of Grass & a Car
   */
  public void draw() {
   background(220);
  
   // House
   stroke(0);
   fill(240, 250, 190);
   rect((float)(width / 8), (float)(height / 1.38), (float)(width / 20), (float)(height/4));
    
   // Roof
   fill(210, 100, 75);
   triangle(0, (float)(height / 1.38), (float)(width / 1.18), (float)(height / 1.38), (float)(width / 2.35), (float)(height / 1.85));
    
   // Window
   stroke(255);
   fill(140, 220, 240);
   rect((float)(width / 6.67), (float)(height / 1.23), (float)(width / 13.33), (float)(width / 13.33));
   line((float)(width / 5.33), (float)(height / 1.23), (float)(width / 5.33), (float)(height / 1.14));
   line((float)(width / 6.67), (float)(height / 1.18), (float)(width / 4), (float)(height / 1.18));
    
   // Door
   stroke(0);
   fill(170, 105, 50);
   rect((float)(width / 4.12), (float)(height / 1.18), (float)(width / 20.51), (float)(height / 10.26));
   stroke(255, 140, 105);
   fill(255, 140, 105);
   ellipse((float)(width / 3.48), (float)(height / 1.09), (float)(width / 133.33), (float)(width / 133.33));
   
   // Grass
   stroke(50, 170, 65);
   fill(50, 170, 65);
   rect(0, height, width, height);
    
   // Drawing Car
   stroke(0);
     
   // Body
   fill(200, 100, 100);
   rect((float)(width / 1.82), (float)(height / 1.11), (float)(width / 6.67), (float)(height / 20));
    
   // Roof
   fill(100, 100, 100);
   rect((float)(width / 1.74), (float)(height / 1.14), (float)(width / 10), (float)(height / 40));
    
   // Wheels
   fill(50);
   ellipse((float)(width / 1.7), (float)(height / 1.05), (float)(width / 26.67), (float)(width / 26.67));
   ellipse((float)(width / 1.54), (float)(height / 1.05), (float)(width / 26.67), (float)(width / 26.67));
  }
  // define other methods down here.
}