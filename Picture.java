/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle suelo;
    private Person persona;
    private Circle grande;
    private Triangle mediano;
    private Square peque�o;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        suelo = new Circle();
        suelo.changeColor("green");
        suelo.moveHorizontal(-500);
        suelo.moveVertical(150);
        suelo.changeSize(1000);
        suelo.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.changeSize(80);
        sun.makeVisible();
        
        persona = new Person ();
        persona.moveHorizontal(-300);
        persona.makeVisible();
        
        grande = new Circle ();
        grande.changeSize(200);
        
        
        mediano = new Triangle ();
        mediano.changeSize(100,80);
        
        peque�o = new Square ();
        peque�o.changeSize(50);
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
     /**
     * Change the sun up/down
     */
    public void moveSun()
    {
        sun.slowMoveVertical(75);
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        suelo.changeColor("black");
    }
    
     /**
     * Person move left/right
     */
    public void movePerson()
    {
        persona.slowMoveHorizontal(150);
    }
    
     /**
     * Create new objects
     */
    public void createObjects()
    {
        grande.makeVisible();
        mediano.makeVisible();
        peque�o.makeVisible();
    }
    
    /**
     * Move new objects
     */
    public void moveObjects()
    {
        grande.slowMoveHorizontal(500);
        mediano.slowMoveHorizontal(500);
        peque�o.slowMoveHorizontal(500);
    }
}
