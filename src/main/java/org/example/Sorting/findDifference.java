package org.example.Sorting;

public class findDifference {
    public char finddifference(String s, String t)
    {
        int[] freq = new int[26];

        for(int i=0; i<s.length();i++)
            freq[s.charAt(i) - 'a']++;

        for(int i=0; i<t.length();i++)
            freq[t.charAt(i) - 'a']--;

        for(int i=0; i<26;i++)
        {
            if(freq[i] != 0)
                return (char)(i+97);
        }
        return 'a'; // The control would not reach here at any cost, so returned a random character here.
    }
}
