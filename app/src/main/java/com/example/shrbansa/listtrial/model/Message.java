package com.example.shrbansa.listtrial.model;

/**
 * Created by shrbansa on 8/21/17.
 */

public class Message
{
	private String mText;
	private boolean ifAccepted;

	public Message(String msg, String a, String b)
	{
		this.mText = msg;
		ifAccepted = false;
	}

	public String getMessage()
	{
		return this.mText;
	}
}
