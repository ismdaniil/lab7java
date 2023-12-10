import java.util.Scanner;

//Платформе
public class Button
{
	private boolean OnOff;

	private static Button lastButton;
	private Button prev;
	private Button next;


//Конструктор
public Button()
{
	OnOff = false;
}

// Конструктор с параметрами
public Button(boolean OnOff)
{
	this.OnOff = OnOff;
}

//Ф-ии получения данных из полей
public boolean GetButton()
{
	return OnOff;
}

//Задание полей класса кнопка
public void Set(boolean onoffi)
{
	OnOff = onoffi;
}

//Вывод данных о кнопке
public void Display()
{
	if (OnOff == true)
		System.out.println("Button pressed");
	else
		System.out.println("Button NOT pressed");
}

//Нажатие кнопки
public void RandRotate()
{
	if (OnOff == true)
        OnOff = false;
    else
        OnOff = true;
}

// Новый список
public void NewList()
{
	lastButton = null;
}

// Добавление элемента в конец списка
public void Add()
{
	if (lastButton == null)
 	this.prev = null;
 	else
 	{
 		lastButton.next = this;
 		prev = lastButton;
 	}
 	lastButton = this;
 	this.next = null;
}

// Вывод на дисплей содержимого списка
public void reprint()
{
 	Button uk; // Вспомогательная ссылка
 	uk = lastButton;
 	if (uk == null)
 	{
 		System.out.println("The list is empty");
 		return;
 	}
 	else
 	System.out.println("\nList content:\n");
 	// Цикл печати в обратном порядке значений элементов списка:
 	while (uk != null)
 	{
 		System.out.println(uk.OnOff + "\t");
 		uk = uk.prev;
 	}
}

}