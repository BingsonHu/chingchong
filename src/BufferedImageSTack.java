
// Shayaan Rafiq, Benson Hu
// this file makes a stack class
// 

import java.awt.image.BufferedImage;

public class BufferedImageSTack {

    private BufferedImage[] stackArray;
    private int top;

  
    public BufferedImageSTack() {
        stackArray = new BufferedImage[2];
        top = -1; 
    }

  
    public void push(BufferedImage someBufferedImage) {
        if (top == stackArray.length - 1) {
            BufferedImage[] newArray = new BufferedImage[stackArray.length * 2];
            for (int i = 0; i < stackArray.length; i++) {
                newArray[i] = stackArray[i];
            }
            stackArray = newArray; 
        }
        top++; 
        stackArray[top] = someBufferedImage; 
    }

   
    public BufferedImage pop() {
        if (isEmpty()) {
        	throw new IllegalArgumentException("Value cannot be negative.");
        }
        BufferedImage poppedImage = stackArray[top];
        stackArray[top] = null;
        top--; 
        return poppedImage;
    }

   
    public boolean isEmpty() {
        return (top == -1); 
    }

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int getSize() {
        return top + 1; // The number of elements is top + 1
    }
    
    public int getArraySize()
    {
    	return stackArray.length;
    }

}