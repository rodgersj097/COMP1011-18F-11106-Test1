package sample;

public class sign {

    private int height, width;
    private String message;

    public sign(int height, int width, String message) {
        setHeight(height);
        setWidth(width);
        setMessage(message);


    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        if(height > 10 && height < 100)
          this.height = height;
        else {
            throw new IllegalArgumentException("height has to be between 10-100");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width)  {
        if(width > 10 && width < 500)
          this.width = width;
        else{
            throw new IllegalArgumentException("Width has to be between 10-500");
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if(message != null )
        this.message = message;
        else {
            throw new IllegalArgumentException("Message cannot be blank" );
        }
    }
}
