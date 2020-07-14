 public static int sol(int arr[], int n)
  {
      int dp[] = new int[n];
      for(int i=0; i<n; i++)
      {
          dp[i] = arr[i];
      }
      
      int max = 0;
      for(int i=1; i<n; i++)
      {
          for(int j=0; j<i; j++)
          {
              if(dp[j] < dp[i])
              {
                  dp[j] = dp[i] + dp[j];
                  System.out.println(dp[j]);
                  max = Math.max(dp[j], max);
              }
          }
      }
      return max;
      }
