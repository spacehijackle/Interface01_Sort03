package com.sort;

import data.Human;


/**
 * 人間クラスを並び替えるためのインターフェース定義
 *
 * @author t.yoshida
 */
public interface HumanComparator
{
	/**
	 * {@link Human} のプロパティを比較し、１番目の引数のプロパティのほうが
	 * ２番目のそれより大きい場合、true を返す（※昇順の場合）。
	 *
	 * @param human1 人間クラス
	 * @param human2 人間クラス
	 * @return true: １番目の引数のプロパティのほうが大きい場合（※昇順の場合）
	 */
	boolean isNeedToExchange(Human human1, Human human2);
}
