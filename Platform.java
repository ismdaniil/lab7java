import java.util.Scanner;

//Платформе
public class Platform
{
	private int angle = 0;
	private int height = 0;

//Конструктор
public Platform()
{
	angle = 0;
	height = 0;
}

// Конструктор с одним параметром
public Platform(int height)
{
    angle = 0;
    this.height = height;
}

// Конструктор с параметрами
public Platform(int angle, int height)
{
    this.angle = angle;
    this.height = height;
}

//Установка угла
public void SetAngle(int angle) 
{
    this.angle = angle;
}
//Установка длины
public void SetHeight(int height)
{
    this.height = height;
}

//Ф-ии получения данных из полей
public int GetAngle()
{
	return angle;
}
public int GetHeight()
{
	return height;
}

//Ввод данных о Платформе
public void InpData()
{
	Scanner in = new Scanner(System.in);

	System.out.println("Input angle");
	angle = in.nextInt();
	System.out.println("Input height");
	height = in.nextInt();
	in.close();
}


//Вывод данных о Платформе
public void Display()
{
	System.out.println("angle = " + angle + " \nheight = " + height);
}

//Случайное изменение угла
public void RandRotate()
{
	angle = (int) (Math.random() * 10);
}

}