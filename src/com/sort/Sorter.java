package com.sort;

import data.Human;

/**
 * ソートクラス
 *
 * @author t.yoshida
 */
public class Sorter
{
	/**
	 * 人間配列の並び替え（選択ソート）
	 *
	 * @param humans 人間配列
	 * @param comparator 大小比較
	 */
	public static void selectionSort(Human[] humans, HumanComparator comparator)
	{
		int count = humans.length;
		for(int i=0; i<count; i++)
		{
			/*
			 * i ～ (count - 1) の間で最小値のインデックスを探索
			 */
			int idxMin = i;
			for(int j=(i+1); j<count; j++)
			{
				if(comparator.isNeedToExchange(humans[idxMin], humans[j]))
				{
					idxMin = j;
				}
			}

			// 最小値のインデックス idxMin の値と i を交換
			Human tmp = humans[i];
			humans[i] = humans[idxMin];
			humans[idxMin] = tmp;
		}
	}
}
