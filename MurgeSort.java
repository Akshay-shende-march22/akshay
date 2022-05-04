	//murge sort

	class MurgeSort{
	void murge(int vv[],int l ,int m,int r){
		int x = m-l+1;
		int y = r-m;
		int p[] = new int[x];
		int u[] = new int[y];
		
		for(int i=0;i<p.length;i++){
			p[i] = vv[l+i];
		}
		
		for(int j =0;j<u.length;j++){
			u[j] = vv[m+j];
		}
		
		int a=0,b=0,c=l;
		while(a<x && b<y){
			
			if(p[a]<u[b]){
			vv[c] = p[a];
			c++;a++;
			}
			else{
				vv[c] = u[b];
				c++;b++;
			}
		}
		
		while(a<x){
			vv[c] = p[a];
			c++; a++;
		}
		while(b<y){
			vv[c]  = u[b];
			c++; b++;
		}
	}
	
	void divide(int ff[],int g,int h){
		if(g<h){
		int mid =g+(h-g)/2;
			divide(ff,g,mid);
			divide(ff,mid+1,h);
			murge(ff,g,mid,h);
	}
	}
	
	void display(int h[]){
		for(int l = 0;l<h.length;l++){
			System.out.print(h[l]+" ");
		}
	}
	
	public static void main(String args[]){
		MurgeSort ms = new MurgeSort();
		int y[] = {7,5,1,9,12};
		ms.divide(y,0,4);
		ms.display(y);
	}
	}