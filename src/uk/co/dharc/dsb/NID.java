package uk.co.dharc.dsb;



public class NID {
	
	public NID()
	{
		m_hasmac = false;
		m_persistent = false;
		m_serial = new char[6];
		m_n = 0;
		m_t = NIDType.SPECIAL;
		m_ll = 0;
	}
	
	public boolean isInteger()
	{
		return m_t == NIDType.INTEGER;
	}
	
	public int toInteger()
	{
		if (isInteger())
		{
			return m_ll;
		}
		else
		{
			return 0;
		}
	}
	
	public int pack(byte buf[])
	{
		return 0;
	}
	
	public int unpack(byte buf[])
	{
		return 0;
	}
	
	public boolean isLocal()
	{	
		for (int i=0; i<m_serial.length; i++)
		{
			if (m_serial[i] != 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	private boolean m_hasmac;
	private boolean m_persistent;
	private char m_serial[];
	private int m_n;
	private NIDType m_t;
	private int m_ll;
}
