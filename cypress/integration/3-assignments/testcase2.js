describe('Amazon test cases', () => {
    it('Visiting `https://www.amazon.in/` and Logging in', () => {
        cy.visit('https://www.amazon.in/');
        cy.get("div#nav-tools a:nth-of-type(2)").click();
        cy.get("#ap_email").type("ishita1395.cse19@chitkara.edu.in");
        cy.get(".a-section span#continue span input#continue").click();
        cy.get("#ap_password").type("Ishita1909#");
        cy.get(".a-section span#auth-signin-button span input#signInSubmit").click();
    })
    it("Next test cases", () => {
        cy.get("#nav-search-dropdown-card div select.nav-search-dropdown").select('Electronics', {force: true})
        cy.get("div.nav-fill div.nav-search-field input#twotabsearchtextbox").type("iPhone 12{enter}")
        cy.get("div.s-product-image-container > div > span > a").first().invoke("removeAttr", "target").click();
        cy.get("#addToCart_feature_div > div > span > span > span input#add-to-cart-button").click();
        cy.get("#attach-view-cart-button-form>span>span>input").click();
    })
});