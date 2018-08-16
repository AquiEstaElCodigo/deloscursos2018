import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController, AlertController } from 'ionic-angular';
import { TerceraPage } from '../tercera/tercera';

/**
 * Generated class for the SegundaPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-segunda',
  templateUrl: 'segunda.html',
})
export class SegundaPage {

  //uso de toggle
  public conmutador : boolean;
  public activarImagen : boolean;
  public visualizarImg : boolean = false;

  constructor(public navCtrl: NavController, public navParams: NavParams,
              public toastCtrl: ToastController, public alertCtrl : AlertController) {

                //uso de toggle
                this.conmutador = false;
                this.activarImagen = false;

  }


  ionViewDidLoad() {
    console.log('ionViewDidLoad SegundaPage');
  }

  irTerceraPagina(){
    this.navCtrl.push(TerceraPage)
  }

  mostrarToast(){

    let toast = this.toastCtrl.create({
      message: 'Mensaje',
      duration: 2000,
      position: 'top'
    });
    toast.present()

  }

  /*
  *     USO DE TOGGLE PRIMERA PARTE
  */
  public verificarToggle(){
    console.log("Conmutador: " + this.conmutador);

    if(this.conmutador == true){

      this.mostrarAlerta()
    }

  }

  mostrarAlerta(){

    let alert = this.alertCtrl.create({
      title: 'Ejemplo Toggle',
      subTitle: 'Toggle activado',
      buttons: ['Aceptar']
    });
    alert.present()
  }

  /*
  *     USO DE TOGGLE SEGUNDA PARTE ---- IMAGEN ----
  */

 public mostrarImagen(){

  if(this.activarImagen == true){
    
    console.log("activar imagen: " + this.activarImagen);
    this.visualizarImg = !this.visualizarImg; 
   
  }else if(this.activarImagen == false){

    this.visualizarImg = false;
  }

}




}
