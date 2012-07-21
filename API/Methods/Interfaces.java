/******************************************************
* Created by Marneus901                                *
* © 2012 MarneusScripts.com                            *
* **************************************************** *
* Access to this source is unauthorized without prior  *
* authorization from its appropriate author(s).        *
* You are not permitted to release, nor distribute this* 
* work without appropriate author(s) authorization.    *
********************************************************/
package com.Marneus.Bot.API.Methods;

import com.Marneus.Bot.API.Wrappers.Interface;
import com.Marneus.Bot.API.Wrappers.InterfaceChild;

public class Interfaces {
	public static InterfaceChild getChild(final int id) {
		final int x = id >> 0x10;
		final int y = id & 0xffff;
		return Client.getInterfaceHolder()[x].getChildren()[y];
	}
	public static InterfaceChild getMinimapInterface() {//lul
		int ind_GUI = Client.getInterfaceIndex();
		Interface[] gui = Client.getInterfaceHolder();
		if (gui == null || ind_GUI==-1) {
			return null;
		}
		for(InterfaceChild ic : gui[ind_GUI].getChildren()){
			if (ic.getSpecialType() == 1338){
				return ic;
			}
		}
		return null;
	}
}
