package org.thq.annotation.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MyClazz {
	@Autowired
	MyInterface myInterface;
	public void toDo() {
		System.out.println("MyClazz todo before call myinterface todo:");
		myInterface.toDo();
	}

}
