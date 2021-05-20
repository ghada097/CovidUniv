import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BoardDecideurComponent } from './board-decideur.component';

describe('BoardDecideurComponent', () => {
  let component: BoardDecideurComponent;
  let fixture: ComponentFixture<BoardDecideurComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BoardDecideurComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BoardDecideurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
