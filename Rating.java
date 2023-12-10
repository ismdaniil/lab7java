import java.util.Scanner;

//Рейтинг
public class Rating
{
	private int points = 0;
	private Coin[] ArrayCoins = new Coin[5];


//Конструктор
public Rating()
{
	points = 0;
	Coin C = new Coin(0,0);
	for (int i = 0; i < 5; i++)
		ArrayCoins[i] = C;
}

public Rating(int points)
{
	this.points = 0;
	if (IsRightRating(points))
		this.points = points;    

	Coin C = new Coin();
    for (int i = 0; i < 5; i++)
        ArrayCoins[i] = C;
}

//Конструктор с параметрами
public Rating(int pointsi, Coin[] array)
{
    points = 0;
	if (IsRightRating(pointsi))
		points = pointsi;   

	Coin C= new Coin();
    for (int i = 0; i < 5; i++)
        ArrayCoins[i] = array[i];
}

//Задание поля Очки
public void SetPoint(int pointsi)
{
		points = 0;
		if (IsRightRating(pointsi))
			points = pointsi;
}

//Задания поля Монеты
public void SetCoinArray(Coin[] array)
{
    Coin C;
    for (int i = 0; i < 5; i++)
        ArrayCoins[i] = array[i];
}

//Задание полей класса 
public void Set(int pointsi, Coin[] array)
{
	points = 0;
	if (IsRightRating(pointsi))
		points = pointsi;

	for (int i = 0; i < 5; i++)
		ArrayCoins[i] = array[i];
}

//Ф-ии получения данных из полей
public int GetPoints()
{
	return points;
}

public Coin GetCoin (int i)
{
	Coin C = new Coin();
	//if (i < 5 && i > -1)
		C = ArrayCoins[i];
	return C;
}

//Вывод рейтинга
public void Display()
{
	System.out.println("Points = " + points);
	System.out.println("Coins: ");
	for (int i = 0; i < 5; i=i+1)
		ArrayCoins[i].Display();
}

public void PlusRating()
{
	points++;
	if (IsRightRating(points) == false)
			points--;
}

// Проверка числа на подходяее для оценки
    public boolean IsRightRating(int rat)
    {
        boolean res = true;
        try                                                    // ищем исключения внутри этого блока и отправляем их в соответствующий обработчик catch
        {
            if (rat < 0 || rat > 15)                          // Если пользователь ввел неверное число, то выбрасывается исключение
                throw new Exception("Incorrect value.");       // выбрасывается исключение типа const char*
            return res;
        }
        catch (Exception ex)           						   // обработчик исключений типа const char*
        {
        	System.out.println("Error: " + ex.getMessage() + '\n');
            res = false;
            return res;
        }
        //return res;
    }
}
