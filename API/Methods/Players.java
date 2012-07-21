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

import java.util.ArrayList;

import com.Marneus.Bot.API.Wrappers.Player;
import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;

public class Players {
	public static Player getMyPlayer(){
		for(ClassHook ch : Data.indentifiedClasses.values()){
			if(ch!=null && ch.containsFieldHook("getMyPlayer")){
				return new Player(ch.getData("getMyPlayer"));
			}
		}
		return null;
	}
	public static Player[] getPlayerArray(){
		ClassHook ch = Data.indentifiedClasses.get("Client");
		if(ch!=null){
			ArrayList<Player> playerList = new ArrayList<Player>();
			for(Object o : (Object[])ch.getData("getPlayerArray")){
				if(o!=null)
					playerList.add(new Player(o));
			}
			return playerList.toArray(new Player[]{});
		}
		return null;
	}
}
