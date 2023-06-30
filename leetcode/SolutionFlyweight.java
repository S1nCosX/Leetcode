package leetcode;

import leetcode.solutions.*;
public class SolutionFlyweight {
    public static Solution getSolution(Task task){
        switch (task){
            case LENGTHOFTHELONGESTALPHABETICALCONTINUOUSSUBSTRING -> {return new SolutionLongestContinuousSubstring();}
            case TWOSUM -> {return new SolutionTwoSum();}
            case THREESUM -> {return new SolutionSum3();}
            case ADDTWONUMBERS -> {return new SolutionAddTwoNumbers();}
            case ROMANTOINTEGER -> {return new SolutionRomanToInteger();}
            case MAXAREAOFISLAND -> {return new SolutionMaxAreaOfIsland();}
            case NUMBEROFISLANDS -> {return new SolutionNumIslands();}
            case VALIDPALINDROME -> {return new SolutionValidPalindrome();}
            case ARITHMETICSLICES -> {return new SolutionNumberOfArithmeticSlices();}
            case SUMOFTWOINTEGERS -> {return new SolutionSumOfTwoIntegers();}
            case VALIDPARENTHESES -> {return new SolutionValidBracketSequence();}
            case MATRIXDIAGONALSUM -> {return new SolutionMatrixDiagonalSum();}
            case NUMBEROFPROVINCES -> {return new SolutionProvinces();}
            case SURROUNDEDREGIONS -> {return new SolutionCapture();}
            case GENERATEPARENTHESES -> {return new SolutionGenerateValidBracketSequence();}
            case LONGESTCOMMONPREFIX -> {return new SolutionLongestCommonPrefix();}
            case DETONATEMAXIMUMBOMBS -> {return new SolutionBombs();}
            case PALINDROMELINKEDLIST -> {return new SolutionPalindromeLinkedList();}
            case NUMBEROFZEROFILEDSUBARRAYS -> {return new SolutionZeroFilledSubarray();}
            case LONGESTSUBSTRINGWITHOUTREPEATINGCHARACTERS -> {return new SolutionLengthOfLongestSubstring();}
        }
        return new SolutionError();
    }
    public static Solution getSolution(int task){
        for (Task i: Task.values()) {
            if (task == i.getTaskNumber()){
                return getSolution(i);
            }
        }
        return new SolutionError();
    }
}
