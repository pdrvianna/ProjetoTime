
public class Time {

		private int hora;
		private int mim;
		private int segundo;
		
		public Time(int hora, int mim, int segundo) {

			this.hora = hora;
			this.mim = mim;
			this.segundo = segundo;
		}

		public int getHora() {
			return hora;
		}

		public void setHora(int hora) {
			this.hora = hora;
		}

		public int getMim() {
			return mim;
		}

		public void setMim(int mim) {
			this.mim = mim;
		}

		public int getSegundo() {
			return segundo;
		}

		public void setSegundo(int segundo) {
			this.segundo = segundo;
		}
		
		public void setTime(int h, int m, int s){
			hora = h;
			mim = m;
			segundo = s;
		//	return "Hora atualizada";
		
		}
	
		public String exibirHoraUniversal(){
				return (hora+":"+mim+":"+segundo);
		}
		public String exibirHoraPadrao(){
			int h=0;
			if (hora >= 12){
				h = hora - 12;
				if (hora==12) {return (hora+":"+mim+":"+segundo+" PM");}else{return (h+":"+mim+":"+segundo+" PM");}
			} else {
				return (hora+":"+mim+":"+segundo+" AM");
			}
			
			
			private String formataNumero (int num){
				if (num < 10) {
					return "0"+num;
					
				}else {
					return num+"";
				}
			}
			//outra versao
		private String fmtNum(int num) {
			return (num<10) ? "0"+num : String.ValueOf(num);
		}
	}
	
}
