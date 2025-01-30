public class main3 {
    public static void main(String[] args) {
        UIControl[] control = new UIControl[3];

        control[0] = new Button("click");
        control[1] = new TextBox();
        control[2] = new ColorPicker("black");

        UIPanel u = new UIPanel(control);
        u.drawAll();
    }
}

class UIPanel {
    private UIControl[] controlArray;


    public UIPanel(UIControl[] ui) {
        this.controlArray = ui;
    }

    public void drawAll() {
        for (UIControl u : controlArray) {
            u.draw();
        }
    }
}

abstract class UIControl {
    public abstract void draw();

    public abstract void handleEvent(String event);

    public String getName() {
        return this.getClass().getSimpleName();
    }
}

class Button extends UIControl {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public Button() {
        this.label = "";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button with label " + label);
    }

    @Override
    public void handleEvent(String event) {
        if (event.toLowerCase().equals("click")) {
            System.out.println("Button label " + event);
        }
    }

    @Override
    public String getName() {
        return label;
    }
}

class TextBox extends UIControl {
    private String text;

    public TextBox(String text) {
        this.text = text;
    }

    public TextBox() {
        this.text = "";
    }

    @Override
    public void draw() {
        System.out.println("Drawing TextBox with current " + text);
    }

    @Override
    public void handleEvent(String event) {
        if (event.toLowerCase().equals("textChange")) {
            System.out.println("TextChange text" + event);
        }
    }

    @Override
    public String getName() {
        return text;
    }
}

class ColorPicker extends UIControl {
    private String color;

    public ColorPicker(String color) {
        this.color = color;
    }

    public ColorPicker() {
        this.color = "";
    }

    @Override
    public void draw() {
        System.out.println("Drawing ColorPicker with selected color " + color);
    }

    @Override
    public void handleEvent(String event) {
        System.out.println("ColorPicker color " + event);
        }
    
    @Override
    public String getName() {
        return color;
    }
    
}