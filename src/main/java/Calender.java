public class Calender
{
    public boolean isSlotAvailable(int[] time, int start, int end)
    {
        boolean isAvailable = true;

        for (int j = start; j < end; j++)
        {
            if (time[j] == 1)
            {
                isAvailable = false;
                break;
            }
        }
        return isAvailable;
    }
}


// 1. person whole slots is empty then slots are available return true
// 2. person slot overlap with start and end then return false
// 3. person slot does not overlap with start and end then return true
