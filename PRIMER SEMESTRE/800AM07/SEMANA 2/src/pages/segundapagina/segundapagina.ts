import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { AlertController } from 'ionic-angular';

/**
 * Generated class for the SegundapaginaPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-segundapagina',
  templateUrl: 'segundapagina.html',
})
export class SegundapaginaPage {

  constructor(public navCtrl: NavController, public navParams: NavParams,
              public alertCtrl: AlertController) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad SegundapaginaPage');
  }


  ejecutarAlerta(){
    let alert = this.alertCtrl.create({
      title: 'Titúlo del dialogo',
      subTitle: 'Mensaje del dialogo',
      buttons: ['Aceptar']

    });
    alert.present();
  }

}
