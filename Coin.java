import java.util.Scanner;

//Монета
public class Coin extends Point implements ICoord
{
	private int x = 0;
	private int y = 0;


//Конструктор
public Coin()
{
	x = 0;
	y = 0;
}

public Coin(int x)
{
    this.x = x;
    y = 0;
}

public Coin(int x, int y)
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

// Поверхностная копия
    public Coin ShallowCopy()
    {
        return (Coin)this;
    }

    // Конструктор копирования (Глубокая копия)
    public Coin(Coin otherCoin)
    {
        x = otherCoin.x;
        y = otherCoin.y;
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

//Ввод данных о Монете
public void InpData()
{
	Scanner in = new Scanner(System.in);

	System.out.println("Input x");
	x = in.nextInt();
	System.out.println("Input y");
	y = in.nextInt();
	in.close();
}

//Случайный ввод координат монеты
public void RandXY()
{
	x = (int) (Math.random() * 10);
	y = (int) (Math.random() * 10);
}


//Вывод данных о Монете
public void Display()
{
	System.out.println("X = " + x + " Y = " + y);
}

@Override public String Who()
{
	return "Coin ";
}

}