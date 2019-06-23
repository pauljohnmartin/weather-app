import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { from } from 'rxjs';
import { FormsModule } from '@angular/forms';
import { MatSelectModule, MatInputModule, MatListModule, MatFormFieldModule } from '@angular/material';

@NgModule({
  imports: [
    CommonModule,
    MatFormFieldModule,
    FormsModule,
    MatSelectModule,
    MatInputModule,
    MatListModule
  ],
  exports: [
    MatFormFieldModule,
    FormsModule,
    MatSelectModule,
    MatInputModule,
    MatListModule
  ],
  declarations: []
})
export class MaterialModule { }
