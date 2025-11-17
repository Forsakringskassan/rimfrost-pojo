package se.fk.github.Kund.Folkbokforing;

public class Folkbokforingsadress {
    private String careOf;
    private String utdelningsadress1;
    private String utdelningsadress2;
    private String postnummer;
    private String postort;

    public Folkbokforingsadress(){}

    public Folkbokforingsadress(String careOf, String utdelningsadress1, String utdelningsadress2, String postnummer, String postort)
    {
        this.careOf = careOf;
        this.utdelningsadress1 = utdelningsadress1;
        this.utdelningsadress2 = utdelningsadress2;
        this.postnummer = postnummer;
        this.postort = postort;
    }

    public String getCareOf() {
        return careOf;
    }

    public void setCareOf(String careOf) {
        this.careOf = careOf;
    }

    public String getUtdelningsadress1() {
        return utdelningsadress1;
    }

    public void setUtdelningsadress1(String utdelningsadress1) {
        this.utdelningsadress1 = utdelningsadress1;
    }

    public String getUtdelningsadress2() {
        return utdelningsadress2;
    }

    public void setUtdelningsadress2(String utdelningsadress2) {
        this.utdelningsadress2 = utdelningsadress2;
    }

    public String getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(String postnummer) {
        this.postnummer = postnummer;
    }

    public String getPostort() {
        return postort;
    }

    public void setPostort(String postort) {
        this.postort = postort;
    }
}
