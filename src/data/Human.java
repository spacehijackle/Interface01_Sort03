package data;


/**
 * 人間クラス
 *
 * @author t.yoshida
 */
public class Human
{
	// アイコン
	private String _icon;

	// 名前
	private String _name;

	// 年齢
	private int _age;

	// 身長
	private int _height;

	/**
	 * 人間を生成する。
	 *
	 * @param icon アイコン（絵文字）
	 * @param name 名前
	 * @param age 年齢
	 * @param height 身長
	 */
	public Human(String icon, String name, int age, int height)
	{
		_icon = icon;
		_name = name;
		_age = age;
		_height = height;
	}

	/**
	 * 名前を返す。
	 *
	 * @return 名前
	 */
	public String getName()
	{
		return _name;
	}

	/**
	 * 年齢を返す。
	 *
	 * @return 年齢
	 */
	public int getAge()
	{
		return _age;
	}

	/**
	 * 身長を返す。
	 *
	 * @return 身長
	 */
	public int getHeight()
	{
		return _height;
	}

	@Override
	public String toString()
	{
		return _icon + _name + ": " + _age + "歳 " + _height + "cm";
	}
}
