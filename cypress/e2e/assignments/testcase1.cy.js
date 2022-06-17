/// <reference types="cypress" /> 

describe("Bajaj test cases",()=>{


beforeEach(()=>{
    cy.viewport(1994,1600);

})

it("google test cases",()=>{
    cy.visit("http://www.google.com/");
    cy.get('input[name="q"]').type("Bajaj Finserv Health {enter}")
    
})

it('visit bajaj site', () => {
    cy.contains("Bajaj Finserv Health - Your Personalized Healthcare Platform").click();
    cy.url().should('include','bajajfinservhealth.in');
})

it("next test case",()=>{
     cy.get("#searchBarInput").type("doctor {enter}");
     cy.get('.css-1kj8wbb a').first().click();
     cy.get(':nth-child(1) > .css-1vjdln7 > :nth-child(5) > .css-uvjnz5 > [data-name="18:30:00"] > [data-testid="appt-slots"]').first().click();
});

})