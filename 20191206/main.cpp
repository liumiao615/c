
#include <iostream>
#include<stdlib.h>

#include "linkedList.h"

using namespace std;

int main() {

	//std::cout << "Hello, World!" << std::endl;

	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	linkedList l1;

	linkedList l2(a, 9);

	//cout << sizeof(l1) << " " << sizeof(l2) << endl;

	cout << l1.len() << " " << l2.len() << endl;

	cout << l2.getElem(0) << endl;

	cout << int(NULL) << endl;

	l1.showList();

	l2.showList();

	l2.listInsert(4, 20);

	l2.showList();

	cout << l2.listDelete(6) << endl;

	l2.showList();

	cout << l2.locateElem(20);
	system("pause");

	return 0;

}
