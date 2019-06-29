#include <iostream>
#include <locale>

int main()
{
std::wcout.imbue(std::locale("Polish_poland.852"));
std::wcout << L"ĄĘŁÓąężźłóśŚŻŹ\n";
}

class TypyDanych {
    public static void main(String[] args) {
		System.out.print("Cześć Jan, słyszałem, że masz ");
		System.out.print(25);
		System.out.println(" lat i uczysz się programowania. Czy to prawda?");
		System.out.println(true);
		System.out.print("Czy Twoje inicjały to ");
		System.out.print('J');
		System.out.print(" ");
		System.out.print('K');
		System.out.println('?');
		System.out.print("Tak, ");
		System.out.println(true);
		}
}