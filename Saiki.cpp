#include<bits/stdc++.h>
using namespace std;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#define ll long long

int tona(vector<int> &a,int k){
	int kai = k;
	int n2 =1;
	rep(i,kai-1) n2 *=2;
	if(k == 1) return min(a[0],a[1]);
	rep(i,n2){
		if(a[2*i] > a[2*i+1]) a[2*i+1] = 0;
		else  a[2*i] = 0;
	}
	
	int s = a.size();
	for (vector<int>::iterator it  = a.begin(); it != a.end();) {
    if (*it == 0) {
      it = a.erase(it);
    }
    else {
      ++it;
    }
  }
	
	k--;
	int re = tona(a,k);
	return re;
}
int main(){
	int n=0;cin >> n;
	int n2 =1;
	rep(i,n) n2 *=2;

	vector<int> a,b;

	rep(i,n2){
		int x = 0;
		cin>>x;
		a.push_back(x);
		b.push_back(x);
	}
	int point = tona(a,n);
	rep(i,n2){
		if(b[i] == point){
			cout << i + 1 << endl;
			return 0;
		}
	}
	return 0;
}