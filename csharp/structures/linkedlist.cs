using System;
using System.Collections;
using System.Collections.Generic;

public class TestProgram
{
	public static void Main(string[] args)
	{
		var linkedList = new LinkedList<int>();
		
		Console.WriteLine("Count: " + linkedList.Count);
		
		linkedList.Add(3);
		Console.WriteLine(linkedList);
		Console.WriteLine("Count: " + linkedList.Count);
		
		linkedList.Add(5);
		Console.WriteLine(linkedList);
		Console.WriteLine("Count: " + linkedList.Count);
		
		linkedList.Add(7);
		Console.WriteLine(linkedList);
		Console.WriteLine("Count: " + linkedList.Count);
		
		linkedList.Remove(5);
		Console.WriteLine(linkedList);
		Console.WriteLine("Count: " + linkedList.Count);
		Console.WriteLine("Contains(5): " + linkedList.Contains(5));
		Console.WriteLine("Contains(7): " + linkedList.Contains(7));
	}
}

public class Node<T>
{
	/// <summary>
	///  Constructs a new node with the specified value.
	/// </summary>
	public Node(T value)
	{
		Value = value;
	}

	/// <summary>
	///  The node value.
	/// </summary>
	public T Value { get; private set; }
	
	/// <summary>
	///  The next node in the linked list.
	/// </summary>
	public Node<T> Next { get; internal set; }
	
	public override string ToString()
	{
		return "[node=" + Value + "] -> " + (Next == null ? "null" : Next.ToString());
	}
}

public class LinkedList<T> : ICollection<T>
{
	private Node<T> _head;
	private Node<T> _tail;
	
	/// <summary>
	///  Adds the provided value to the end of the linked list;
	/// </summary>
	public void Add(T value)
	{
		var node = new Node<T>(value);
	
		if (_head == null)
		{
			_head = node;
			_tail = node;
		}
		else
		{
			_tail.Next = node;
			_tail = node;
		}
		
		Count++;
	}
	
	/// <summary>
	///  Removes the first node in the list whose value euqals the provided value.
	///  The method returns true if a value was removed. Otherwise it returns false.
	/// </summary>
	public bool Remove(T item)
	{
		Node<T> previous = null;
		var current = _head;
	
		// 1: Empty list: Do nothing.
		// 2: Single node: Previous is null.
		// 3: Many nodes:
		//		a: Node to remove is the first node.
		//		b: Node to remove is the middle or last.
	
		while (current != null)
		{
			if (current.Value.Equals(item))
			{
				// It's a node in the middle or end.
				if (previous != null)
				{
					// Case 3b.
					previous.Next = current.Next;
					
					// It was the end, so update _tail;
					if (current.Next == null)
						_tail = previous;
				}
				else
				{
					// Case 2 or 3a.
					_head = _head.Next;
					
					// Is the list now empty?
					if (_head == null)
						_tail = null;
				}
				
				Count--;
				return true;
			}
			
			previous = current;
			current = current.Next;
		}
		
		return false;
	}
	
	/// <summary>
	/// Returns a boolean that indicates whether the provided value exists whithin the linked list.
	/// </summary>
	public bool Contains(T value)
	{
		var current = _head;
		
		while (current != null)
		{
			if (current.Value.Equals(value))
				return true;
				
			current = current.Next;
		}
		
		return false;
	}
	
	/// <summary>
	///  Removes all the items from the list.
	/// </summary>
	public void Clear()
	{
		_head = null;
		_tail = null;
		Count = 0;
	}
	
	/// <summary>
	///  Returns an integer indicacting the number of items currently in the list.
	///  When the list is empty, the value returned is 0.
	/// </summary>
	public int Count { get; private set; }
	
	/// <summary>
	///  Copies the contents of the linked list from start to finish into the provided array,
	///  starting at the specified array index.
	/// </summary>
	public void CopyTo(T[] array, int arrayIndex)
	{
		var current = _head;
		
		while (current != null)
		{
			array[arrayIndex++] = current.Value;
			current = current.Next;
		}
	}
	
	/// <summary>
	///  Returns an IEnumerator<T> instance that allows enumerating the linked list values from first to last.
	/// </summary>
	public IEnumerator<T> GetEnumerator()
	{
		var current = _head;
		
		while (current != null)
		{
			yield return current.Value;
			current = current.Next;
		}
	}
	
	IEnumerator IEnumerable.GetEnumerator()
	{
		return ((IEnumerable<T>)this).GetEnumerator();
	}
	
	/// <summary>
	///	 Returns false if the list is not read-only.
	/// </summary>
	public bool IsReadOnly { get { return false; } }
	
	public override string ToString()
	{
		return _head.ToString();
	}
}