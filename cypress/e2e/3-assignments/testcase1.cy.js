/// <reference types="cypress" /> 

describe("my test case",()=>{


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
     cy.get('div.MuiGrid-root.MuiGrid-container div div.slotTimeContainer a').first().click();
})

it("taking screenshot", () => {
    cy.screenshot();
})

})