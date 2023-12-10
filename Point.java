import java.util.Scanner;

interface ICoord
{
    // Ввод 
    void InpData();

    // Вывод 
    void Display();

    // Виртуальная/не виртуальная функция вывода что за объект
    String Who();
}

public abstract class Point implements ICoord
{
	protected int x = 0;
	protected int y = 0;


//Конструктор
public Point()
{
	x = 0;
	y = 0;
}

public Point(int x)
{
    this.x = x;
    y = 0;
}

public Point(int x, int y)
{
    this.x = x;
    this.y = y;
}

public void SetX(int x) {
    this.x = x;
}
public void SetY(int y) {
    this.y = y;
}

public void Set(int x, int y) {
	this.x = x;
    this.y = y;
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

//Ввод данных
public void InpData()
{
	Scanner in = new Scanner(System.in);

	System.out.println("Input x");
	x = in.nextInt();
	System.out.println("Input y");
	y = in.nextInt();
	in.close();
}

//Вывод данных 
public void Display()
{
	System.out.println("X = " + x + " Y = " + y);
}

public String Who()
{
	return "Point ";
}
public void MyLocation()
{
	System.out.println(Who());
	System.out.println("X = " + x + " Y = " + y);
}


}