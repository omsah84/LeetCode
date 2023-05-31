class Soluation
{
    int humInt(__UINT32_TYPE__ n)
    {
        int count = 0;
        while (n != 0)
        {
            if (n & 1)
            {
                coun = count + 1;
            }
            n = n >> 1;
        }
    }

    return count;
};