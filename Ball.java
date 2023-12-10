import java.util.Scanner;

//Мяч
public class Ball extends Point implements ICoord
{
	private String Name = "";


//Конструктор
public Ball()
{
	x = 0;
	y = 0;
	Name = "";
}
public Ball(String name)
{
    x = 0;
    y = 0;
    Name = name;
}

public Ball(int x_, int y_, String name)
{
    super(x_,y_);
    Name = name;
}

//Установщики значений
public void SetX(int x_) 
{
    x = x_;
}

public void SetY(int y_)
{
    y = y_;
}

public void SetName(String name)
{
    Name = name;
}
public void Set(int x, int y, String name)
{
	this.x = x;
	this.y = y;
    Name = name;
}

//Ф-ии получения данных из полей
public int GetX()
{
	return x;
}
public int GetY()
{
	return y;
}
public String GetName()
{
	return this.Name;
}

//Ввод данных о Мяче
@Override public void InpData()
{
	Scanner in = new Scanner(System.in);

	System.out.println("Input x of Ball");
	x = in.nextInt();
	System.out.println("Input y of Ball");
	y = in.nextInt();
	System.out.println("Input Name of Ball");
	String s = in.nextLine();
	Name = in.nextLine();
	in.close();
}


//Вывод данных о Мяче
public void Display()
{
	System.out.println("X = " + x + " Y = " + y + " Name - " + Name);
}

//Сделать шаг

public void MoveBall()
{
	Scanner in = new Scanner(System.in);	

	System.out.println("Press \n  'D' to increase the x value \n  'A' to decrease the x value\n  'W' to increase the y value\n  'S' to decrease the y value");
	String k = in.next();
	char key = k.charAt(0);
	if (key == 'a')
        x--;
    if (key == 'd')
        x++;
    if (key == 'w')
        y++;
    if (key == 's')
        y--;
}

public void ModernName()
{
	Name = "Ball " + Name;
}

@Override public String Who()
{
	return "Ball ";
}

// Метод ToString
        public String ToString()
        {
            return ("X = " + x + " Y = " + y + " Name - " + Name);
        }

// Поверхностная копия
public Ball ShallowCopy()
{
    return (Ball)this;
}


    // Конструктор копирования (Глубокая копия)
    public Ball(Ball other)
    {
        x = other.x;
        y = other.y;
        Name = other.Name;
    }

}