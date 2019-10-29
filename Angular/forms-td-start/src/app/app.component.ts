import { Component, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  @ViewChild('f', {static: false}) signupForm: NgForm;
  defaultQuestion = 'pet';

  // changes made below
  answer = '';

  // changes made below
  genders = ['male','female'];

  // changes made below
  user = {
    username: '',
    email: '',
    secretQuestion: '',
    answer: '',
    gender: ''
  }

  // changes made below
  submitted = false;

  suggestUserName() {
    const suggestedName = 'GreenArrow0056';
    // change made here
    // this.signupForm.setValue({
    //   userData: {
    //     username: suggestedName,
    //     email: ''
    //   },
    //   secret: 'pet',
    //   questionAnswer: '',
    //   gender: 'male'
    // });

    this.signupForm.form.patchValue({
      userData: {
        username: suggestedName
      }
    });
  }

  onSubmit() {
    // changes made below
    this.submitted = true;
    this.user.username = this.signupForm.value.userData.username;
    this.user.email = this.signupForm.value.userData.email;
    this.user.secretQuestion = this.signupForm.value.secret;
    this.user.answer = this.signupForm.value.questionAnswer;
    this.user.gender = this.signupForm.value.gender;
  }

}
