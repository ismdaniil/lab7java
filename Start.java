import java.util.Scanner;

public class Start
{
	public static void main(String[]args)
	{
	Scanner in = new Scanner(System.in);

/*
	Point Point1 = new Point(2, 2);

	System.out.println("3)Method overload... ");

	Point1.Display();
	Ball1.Display();
	Point1.MyLocation();
	Ball1.MyLocation();


	System.out.println("6) toString\n");
	System.out.println("Data Ball: " + Ball1.ToString()); 
	

	System.out.println("8) abstract: \n");
	Ball Ball1 = new Ball(1, 1, "One");
	Ball1.InpData();
	Ball1.Display();
	

	Ball Ball1 = new Ball(2,2, "Dva");
	    Coin Coin1 = new Coin();
	    Coin1.SetX(1);
	    Coin1.SetY(1);

		System.out.println("9) Interface");		
		
		Ball1.Display();
		Coin1.Display();

		System.out.println();

		System.out.println(Ball1.Who());
		System.out.println(Coin1.Who());
*/
		System.out.println("10) Deep and shalow copy:");
		Ball Ball1 = new Ball(9,9, "Nine");
		Ball Ball2 = new Ball(7,7, "Seven");

		Ball2 = Ball1;

		System.out.println("Shalow copy 1st in 2st:");
		Ball1.Display();
		Ball2.Display();
		System.out.println("");
		System.out.println("Change 1st Object:");
		Ball1.Set(3,3, "Three");
		Ball1.Display();
		Ball2.Display();
		System.out.println("");

		Ball1.Set(5,5, "Five");
		Ball2 = new Ball(Ball1);

		System.out.println("Deep copy 1st in 2st:");
		Ball1.Display();
		Ball2.Display();
		System.out.println("");
		System.out.println("Change 1st Object:");
		Ball1.Set(4,4, "Four");
		Ball1.Display();
		Ball2.Display();
		System.out.println("\n\n");


	//Point point1 = new Point();
	//point1.x = 0;
	//System.out.println(point1.x);


/*
	System.out.println("Laba 10\n");
	System.out.println("Value in segment [0;15]\n");
	Rating Rating1 = new Rating(-5);
	System.out.println("Present value: " + Rating1.GetPoints());
	Rating1.SetPoint(16);
	System.out.println("Present value: " + Rating1.GetPoints());
	Rating1.SetPoint(14);
	System.out.println("Present value: " + Rating1.GetPoints());
	Rating1.PlusRating();
	System.out.println("Present value: " + Rating1.GetPoints());
	Rating1.PlusRating();
	System.out.println("Present value: " + Rating1.GetPoints());

/*
	Coin[] Coin1 = new Coin[3]; 
	Coin [][] Coin2 = new Coin[2][2];

		Coin1[0] = new Coin(3,3);
		Coin1[1] = new Coin(4,4);
		Coin1[2] = new Coin(5,5);

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				Coin2[i][j] = new Coin(j,j+2);

		// Вывод
		System.out.println("One dimensional array [3]");
		for (int i = 0; i < 3; i++)
			Coin1[i].Display();

		System.out.println("\nDvumernyy massiv [2][2]");
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				Coin2[i][j].Display();

/*
		System.out.println("\nApp demo:\n");

		Ball MyBall = new Ball();
		Platform MyPlatform = new Platform();
		Rating MyRating = new Rating();
		Button MyButton = new Button();


		Coin[] MyArrayCoins = new Coin[5];
		for (int i = 0; i < 5; i = i + 1)
		{
			MyArrayCoins[i] = new Coin();
			MyArrayCoins[i].RandXY();
		}

	System.out.println("Lab 9\n");
	System.out.println("Ball: ");
	Ball Ball1 = new Ball();
	Ball Ball2 = new Ball("Param");
	Ball Ball3 = new Ball(1, 1, "One");

	System.out.println( "1) Without parameters:");
	Ball1.Display();
	System.out.println( "2) One parameter:");
	Ball2.Display();
	System.out.println( "3) With parameters:");
	Ball3.Display();

	//////////
	System.out.println("\nPlatform: ");
	Platform Platform1 = new Platform();
	Platform Platform2 = new Platform(32);
	Platform Platform3 = new Platform(31, 33);

	System.out.println( "1) Without parameters:");
	Platform1.Display();
	System.out.println( "2) One parameter:");
	Platform2.Display();
	System.out.println( "3) With parameters:");
	Platform3.Display();

	/////////////
	System.out.println("\nCoin: ");
	Coin Coin1 = new Coin();
	Coin Coin2 = new Coin(2);
	Coin Coin3 = new Coin(5,6);

	System.out.println( "1) Without parameters:");
	Coin1.Display();
	System.out.println( "2) One parameter:");
	Coin2.Display();
	System.out.println( "3) With parameters:");
	Coin3.Display();

	/////////////

	System.out.println("\nRating: ");
	Rating Rating1 = new Rating();
	Rating Rating2 = new Rating(10);
	Rating Rating3 = new Rating(3, MyArrayCoins);

	System.out.println( "1) Without parameters:");
	Rating1.Display();
	System.out.println( "2) One parameter:");
	Rating2.Display();
	System.out.println( "3) With parameters:");
	Rating3.Display();

	///////////
	System.out.println("\nButton: ");
	Button Button1 = new Button();
	Button Button2 = new Button(true);

	System.out.println( "1) Without parameters:");
	Button1.Display();
	System.out.println( "2) One parameter:");
	Button2.Display();
	
	///////////////
	Coin[] CoinArr = new Coin[3];
		for (int j = 0; j < 3; j++)
			CoinArr[j] = new Coin(j);
		System.out.println("\nInitalization massiv:");
		for (int j = 0; j < 3; j++)
			CoinArr[j].Display();
		System.out.println("\n\n");

	/////////////

		System.out.println("\nDifference between deep and shallow copy:");
		Coin CoinTestCopy1 = new Coin(4,4), CoinTestCopy2 = new Coin(5,5);

		CoinTestCopy2 = CoinTestCopy1;

		System.out.println("Shallow copy 1 in 2:");
		CoinTestCopy1.Display();
		CoinTestCopy2.Display();
		System.out.println("\nChange 1st object:");
		CoinTestCopy1.Set(3,3);
		CoinTestCopy1.Display();
		CoinTestCopy2.Display();

		CoinTestCopy1.Set(4,4);
		CoinTestCopy2 = new Coin(CoinTestCopy1);

		System.out.println("\nDeep copy 1 in 2:");
		CoinTestCopy1.Display();
		CoinTestCopy2.Display();
		System.out.println("\nChange 1st object:");
		CoinTestCopy1.Set(3,3);
		CoinTestCopy1.Display();
		CoinTestCopy2.Display();




/*
		System.out.println("6) Coins array:");
		Coin[] MyArrayCoins = new Coin[5];
		for (int i = 0; i < 5; i = i + 1)
		{
			MyArrayCoins[i] = new Coin();
			MyArrayCoins[i].RandXY();
			MyArrayCoins[i].Display();
		}


		System.out.println("7) Returning an integer value from a method through a helper class:");
		Coin CoinAux = new Coin();
		CoinAux = MyRating.GetCoin(3);
		CoinAux.Display();

		System.out.println("Laba 8) Static: ");
		// Формирование объектов класса Button:
		Button A = new Button(true);
		Button B = new Button(true);
		Button C = new Button(false);
		Button D = new Button(false);

		A.NewList();
		
		System.out.println("New list: \n");
		// Вызов статической компанентной функции:
		D.reprint();

		System.out.println("Add elements: ");
		// Включение созданных компанентов в двусвязанный список:
		A.Add(); B.Add(); C.Add(); D.Add();

		System.out.println("Reprint: ");
		// Печать в обратном порядке значений элементов списка:
		D.reprint();

		System.out.println("9) String: ");
		MyBall.Set(0,0,"BOSS");
		MyBall.Display();
		MyBall.ModernName();
		MyBall.Display();




/*
		System.out.println("\nData Ball:");
		MyBall.Set(0,0,"BOSS");
		MyBall.Display();
		
		//Platform
		System.out.println("\nData Platform:");
		MyPlatform.Set(25,10);
		MyPlatform.Display();

		System.out.println("\nData Rating:");
		MyRating.Set(4,MyArrayCoins);
		MyRating.Display();

		//Button
		System.out.println("\nData Button:");
		MyButton.Set(false);
		MyButton.Display();

		System.out.println("\nIndividual functions:\n");
		System.out.println("\nTake a ball step:\n");
		MyBall.MoveBall();
		MyBall.Display();

	    System.out.println("\nRandom changing the platform angle:\n");
	    MyPlatform.RandRotate();
	    MyPlatform.Display();


		System.out.println("\nEntering data using the example of a ball:\n");
		MyBall.InpData();
		System.out.println("\nNew data Ball:");
		MyBall.Display();
		*/
	}
}