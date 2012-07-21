/******************************************************
* Created by Marneus901                                *
* © 2012 MarneusScripts.com                            *
* **************************************************** *
* Access to this source is unauthorized without prior  *
* authorization from its appropriate author(s).        *
* You are not permitted to release, nor distribute this* 
* work without appropriate author(s) authorization.    *
********************************************************/
package com.Marneus.Bot.API.Wrappers;

import java.util.ArrayList;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;
import com.Marneus.Enviroment.Hook.ClassHook.FieldHook;

public class HashTable {
	public Object currentObject;
	public ClassHook currentHook;
	public HashTable(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("HashTable");
	}
	public Node[] getBuckets(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getBuckets")){
				ArrayList<Node> nodes = new ArrayList<Node>();
				for(Object o : (Object[])fh.getData(currentObject)){
					nodes.add(new Node(o));
				}
				return nodes.toArray(new Node[]{});
			}
		}	
		return null;
	}
}
