import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author David Scott Moyer
 * @version 23/11/2018
 */
public class MyWorld extends greenfoot.World
{
    // A random number to determine the statement.
    private int random;
    // A random number for the rule.
    private int number;
    // The statement to be set for the rule.
    private String statement;
    // What round the machine is on.
    private int round;
    // The input the player gives.
    private String input;
    // Translates the player's input into an integar.
    private int input2;
    // The statement and number combined into the answer.
    private String answer;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 500, 1); 
        prepare();
    }
    /**
     * Draw a line between two points in the world.
     * 
     * @param x1 The first X coordinate.
     * @param y1 The first Y coordinate.
     * @param x2 The second X coordinate.
     * @param y2 The second Y coordinate.
     * @return Returns nothing.
     */
    private void drawLine(int x1, int y1, int x2, int y2)
    {
        addObject(new Lines(x1,y1,x2,y2),getWidth()/2,getHeight()/2);
    }
    /**
     * Prepares the program by drawing the initial machine, showing the "input"
     * and "output" text, and setting the randomized statement and number.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    private void prepare()
    {
        drawLine(200,0,200,500);
        drawLine(0,400,400,400);
        drawLine(0,100,400,100);
        drawLine(0,150,400,150);
        drawLine(0,200,400,200);
        drawLine(0,250,400,250);
        drawLine(0,300,400,300);
        drawLine(0,350,400,350);
        drawLine(0,400,400,400);
        
        addObject(new Text("I n p u t",35,Color.BLACK),200,50);
        addObject(new Text("O u t p u t",35,Color.BLACK),450,50);
        
        random = Greenfoot.getRandomNumber(4);
        if (random == 0)
        {
            statement = "+";
        }
        else if (random == 1)
        {
            statement = "-";
        }
        else if (random == 2)
        {
            statement = "x";
        }
        else if (random == 3)
        {
            statement = "/";
        }
        number = Greenfoot.getRandomNumber(20)-10;
        if (statement == "-" & number < 0)
        {
            statement = "+";
            number = number * -1;
        }
        if (statement == "+" & number < 0)
        {
            statement = "-";
            number = number * -1;
        }
        answer = statement + number;
        Greenfoot.start();
    }
    /**
     * Runs every time "run" or "act" is called.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    public void act()
    {
        Greenfoot.delay(100);
        nextRound();
    }
    /**
     * Moves on to the next round, and asks the user a question. It then fills in the information and does the math.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    private void nextRound()
    {
        if (round == 0)
        {
            input = Greenfoot.ask("Input a number.");
            input2 = Integer.parseInt(input);
            addObject(new Text(input,20,Color.RED),50,130);
            math();
            addObject(new Text(input2 + "",20,Color.GREEN),250,130);
        }
        else if (round == 1)
        {
            input = Greenfoot.ask("Input a number.");
            input2 = Integer.parseInt(input);
            addObject(new Text(input,20,Color.RED),50,180);
            math();
            addObject(new Text(input2 + "",20,Color.GREEN),250,180);
        }
        else if (round == 2)
        {
            input = Greenfoot.ask("Input a number.");
            input2 = Integer.parseInt(input);
            addObject(new Text(input,20,Color.RED),50,230);
            math();
            addObject(new Text(input2 + "",20,Color.GREEN),250,230);
        }
        else if (round == 3)
        {
            input = Greenfoot.ask("Input a number.");
            input2 = Integer.parseInt(input);
            addObject(new Text(input,20,Color.RED),50,280);
            math();
            addObject(new Text(input2 + "",20,Color.GREEN),250,280);
        }
        else if (round == 4)
        {
            input = Greenfoot.ask("Input a number.");
            input2 = Integer.parseInt(input);
            addObject(new Text(input,20,Color.RED),50,330);
            math();
            addObject(new Text(input2 + "",20,Color.GREEN),250,330);
        }
        else if (round == 5)
        {
            input = Greenfoot.ask("Input a number.");
            input2 = Integer.parseInt(input);
            addObject(new Text(input,20,Color.RED),50,380);
            math();
            addObject(new Text(input2 + "",20,Color.GREEN),250,380);
        }
        else
        {
            input = Greenfoot.ask("What's the rule? ([x,/,+,-](-)#)");
            addObject(new Text(input,50,Color.BLACK),100,460);
            if (input.equals(answer) == true)
            {
                addObject(new Text(answer,50,Color.GREEN),300,460);
            }
            else
            {
                addObject(new Text(answer,50,Color.RED),300,460);
            }
            Greenfoot.stop();
        }
        round++;
    }
    /**
     * The method that does the math for the machine. Reads what the rule is and the player's input, and does the math the machine
     * has given for the rule.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    private void math()
    {
        if (statement == "x")
        {
            input2 = input2 * number;
        }
        else if (statement == "+")
        {
            input2 = input2 + number;
        }
        else if (statement == "-")
        {
            input2 = input2 - number;
        }
        else
        {
            input2 = input2 / number;
        }
    }
}
