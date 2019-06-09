class ListNode
{
	public int data;
	public ListNode next;
	
	public ListNode()
	{
		this(0, null);
	}
	
	public ListNode (int data)
	{
		this (data, null);
	}
	
	public ListNode (int data, ListNode next)
	{
		this.data = data;
		this.next = next;
	}
}


class LinkedIntList
{
	private ListNode front;
	
	public LinkedIntList()
	{
		front = null;
	}
	
	public String toString()
	{
		if (front == null)
		{
			return "[]";
					
	}
		else
		{
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
			
			}
		}
	
	public void add(int value)
	{
		if (front ==null)
		{
			front = new ListNode (value);
		} else {
			ListNode current = front;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new ListNode (value);
			}
		}
	
	public int indexOf (int value)
	{
		int index = 0;
		ListNode current = front;
		while (current != null)
		{
			if (current.data == value)
			{
				return index;
			}
			index = index + 1;
			current = current.next;
		}
		System.out.println ("The number" + value + "is not found in the list.");
		return -1;
	}
	
	public boolean isSorted()
	{
		if (front == null)
		{
			return true;
		}
		else
		{
			ListNode prev = front;
			ListNode current = front.next;
			while(current != null)
			{
				if (prev.data <= current.data)
				{
					prev = current;
					current = current.next;
				}
				else
				{
					return false;
				}
			}
			return true;
				}
			}
		}
	



}
