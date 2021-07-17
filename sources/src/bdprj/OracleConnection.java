package bdprj;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OracleConnection {

    // <editor-fold defaultstate="collapsed" desc="--- VARIABLES ---">
//    private final static String URL = "jdbc:oracle:thin:@oracle.cti.ugal.ro:1521:db"; // url universitate
//    private final static String USERNAME = "cald19"; // username universitate
//    private final static String PASSWORD = "oracle"; // password universitate
    private final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private final static String USERNAME = "system";
    private final static String PASSWORD = "oracle";

    private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="--- ORACLE CONNECTION METHODS ---">
    public static Connection openConnection(Connection connection) {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection != null) {
                System.out.println(
                        "| ::::::::::::::::::\n"
                        + "| Connection opened!");
            } else {
                System.out.println(
                        "| :::::::::::::::::::::::::::::: |\n"
                        + "| Opening connection has failed! |\n"
                        + "| :::::::::::::::::::::::::::::: |\n");
            }
        } catch (SQLException e) {
        }

        return connection;
    }

    public static ResultSet executeQuery(Connection connection, String query) {
        ResultSet results = null;
        Statement statement = null;
        try {
            statement = connection.createStatement();
            System.out.println(
                    "| Executed QUERY: " + query + "");
            results = statement.executeQuery(query);
        } catch (SQLException e) {
        }

        return results;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println(
                        "| Connection closed!\n"
                        + "| ::::::::::::::::::\n");
            } catch (SQLException e) {
            }
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="--- SQL QUERIES METHODS ---">
    public static List<String> getFacultatiUniversitate(String input) {

        List<String> facultatiUniversitate = new ArrayList<>();

        String query
                = "SELECT den_f "
                + "FROM facultate, universitate "
                + "WHERE facultate.cod_u = universitate.cod_u "
                + "AND den_u = '" + input + "' ";
        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                facultatiUniversitate.add(result.getString("den_f"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return facultatiUniversitate;
    }

    public static List<String> getDomeniiFacultate(String input) {

        List<String> domeniiFacultate = new ArrayList<>();

        String query
                = "SELECT den_d "
                + "FROM domeniu, facultate "
                + "WHERE domeniu.cod_f = facultate.cod_f "
                + "AND den_f = '" + input + "' "
                + "ORDER BY cod_d";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                domeniiFacultate.add(result.getString("den_d"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return domeniiFacultate;
    }

    public static List<String> getSpecializariDomeniu(String input) {

        List<String> specializariDomeniu = new ArrayList<>();

        String query
                = "SELECT den_s "
                + "FROM specializare, domeniu "
                + "WHERE specializare.cod_d = domeniu.cod_d "
                + "AND den_d = '" + input + "' "
                + "ORDER BY cod_s";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                specializariDomeniu.add(result.getString("den_s"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return specializariDomeniu;
    }

    public static List<String> getUniversitate(String input) {

        List<String> universitati = new ArrayList<>();

        String query
                = "SELECT den_u "
                + "FROM universitate "
                + "WHERE upper(den_u) like upper('%" + input + "%') "
                + "ORDER BY cod_u";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                universitati.add(result.getString("den_u"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return universitati;
    }

    public static List<String> getAdresaUniversitate(String input) {

        List<String> adresaUniversitati = new ArrayList<>();

        String query
                = "SELECT adresa_u "
                + "FROM universitate "
                + "WHERE upper(den_u) like upper('%" + input + "%') "
                + "ORDER BY cod_u";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                adresaUniversitati.add(result.getString("adresa_u"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return adresaUniversitati;
    }

    public static List<String> getFacultate(String input) {

        List<String> facultati = new ArrayList<>();

        String query
                = "SELECT den_f "
                + "FROM facultate "
                + "WHERE upper(den_f) like upper('%" + input + "%') "
                + "ORDER BY cod_f";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                facultati.add(result.getString("den_f"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return facultati;
    }

    public static List<String> getAdresaFacultate(String input) {

        List<String> adresaFacultati = new ArrayList<>();

        String query
                = "SELECT adresa_f "
                + "FROM facultate "
                + "WHERE upper(den_f) like upper('%" + input + "%') "
                + "ORDER BY cod_f";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                adresaFacultati.add(result.getString("adresa_f"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return adresaFacultati;
    }

    public static List<String> getUniversitateFacultate(String input) {

        List<String> universitateFacultati = new ArrayList<>();

        String query
                = "SELECT den_u "
                + "FROM facultate, universitate "
                + "WHERE facultate.cod_u = universitate.cod_u "
                + "AND upper(den_f) like upper('%" + input + "%') "
                + "ORDER BY cod_f";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                universitateFacultati.add(result.getString("den_u"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return universitateFacultati;
    }

    public static List<String> getDomeniu(String input) {

        List<String> domenii = new ArrayList<>();

        String query
                = "SELECT den_d "
                + "FROM domeniu "
                + "WHERE upper(den_d) like upper('%" + input + "%') "
                + "ORDER BY cod_d";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                domenii.add(result.getString("den_d"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return domenii;
    }

    public static List<String> getFacultateDomeniu(String input) {

        List<String> facultateDomenii = new ArrayList<>();

        String query
                = "SELECT den_f "
                + "FROM domeniu, facultate "
                + "WHERE domeniu.cod_f = facultate.cod_f "
                + "AND upper(den_d) like upper('%" + input + "%') "
                + "ORDER BY cod_d";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                facultateDomenii.add(result.getString("den_f"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return facultateDomenii;
    }

    public static List<String> getSpecializare(String input) {

        List<String> specializari = new ArrayList<>();

        String query
                = "SELECT den_s "
                + "FROM specializare "
                + "WHERE upper(den_s) like upper('%" + input + "%') "
                + "ORDER BY cod_s";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                specializari.add(result.getString("den_s"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return specializari;
    }

    public static String getDenumireSpecializare(int cod_s) {

        String specializare = null;

        String query
                = "SELECT den_s "
                + "FROM specializare "
                + "WHERE cod_s = " + cod_s;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                specializare = result.getString("den_s");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return specializare;
    }

    public static List<String> getDomeniuSpecializare(String input) {

        List<String> domeniuSpecializari = new ArrayList<>();

        String query
                = "SELECT den_d "
                + "FROM specializare, domeniu "
                + "WHERE specializare.cod_d = domeniu.cod_d "
                + "AND upper(den_s) like upper('%" + input + "%') "
                + "ORDER BY cod_s";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                domeniuSpecializari.add(result.getString("den_d"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return domeniuSpecializari;
    }

    public static List<Integer> getDurataSpecializare(String input) {

        List<Integer> durataSpecializari = new ArrayList<>();

        String query
                = "SELECT durata_ani "
                + "FROM specializare "
                + "WHERE upper(den_s) like upper('%" + input + "%') "
                + "ORDER BY cod_s";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                durataSpecializari.add(result.getInt("durata_ani"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return durataSpecializari;
    }

    public static List<String> getRegulaAdmitereSpecializare(String input) {

        List<String> regulaAdmitereSpecializari = new ArrayList<>();

        String query
                = "SELECT descriere "
                + "FROM specializare, regula_admitere "
                + "WHERE specializare.cod_r = regula_admitere.cod_r "
                + "AND upper(den_s) like upper('%" + input + "%') "
                + "ORDER BY cod_s";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                regulaAdmitereSpecializari.add(result.getString("descriere"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return regulaAdmitereSpecializari;
    }

    public static List<Integer> getLocuriBugetSpecializare(String input) {

        List<Integer> locuriBuget = new ArrayList<>();

        String query
                = "SELECT nr_locuri "
                + "FROM locuri, specializare "
                + "WHERE locuri.cod_s = specializare.cod_s "
                + "AND lower(forma_finantare) = 'buget' "
                + "AND upper(den_s) like upper('%" + input + "%') ";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                locuriBuget.add(result.getInt("nr_locuri"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return locuriBuget;
    }

    public static int getLocuriBuget(int cod_s) {

        int locuriBuget = 0;

        String query
                = "SELECT nr_locuri "
                + "FROM locuri, specializare "
                + "WHERE locuri.cod_s = specializare.cod_s "
                + "AND lower(forma_finantare) = 'buget' "
                + "AND specializare.cod_s = '" + cod_s + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                locuriBuget = result.getInt("nr_locuri");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return locuriBuget;
    }

    public static String getFormaFinantareOptiuneCandidat(int cod_o) {

        String forma_finantare = null;
        String query
                = "SELECT forma_finantare "
                + "FROM optiune_candidat "
                + "WHERE cod_o = " + cod_o;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                forma_finantare = result.getString("forma_finantare");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return forma_finantare;
    }

    public static List<Integer> getLocuriTaxaSpecializare(String input) {

        List<Integer> locuriTaxa = new ArrayList<>();

        String query
                = "SELECT nr_locuri "
                + "FROM locuri, specializare "
                + "WHERE locuri.cod_s = specializare.cod_s "
                + "AND lower(forma_finantare) = 'taxa' "
                + "AND upper(den_s) like upper('%" + input + "%') ";
        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                locuriTaxa.add(result.getInt("nr_locuri"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return locuriTaxa;
    }

    public static int getLocuriTaxa(int cod_s) {

        int locuriTaxa = 0;

        String query
                = "SELECT nr_locuri "
                + "FROM locuri, specializare "
                + "WHERE locuri.cod_s = specializare.cod_s "
                + "AND lower(forma_finantare) = 'taxa' "
                + "AND specializare.cod_s = '" + cod_s + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                locuriTaxa = result.getInt("nr_locuri");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return locuriTaxa;
    }

    public static List<String> getNumeCompletCandidat(String input) {

        List<String> numeCompletCandidati = new ArrayList<>();

        String query
                = "SELECT nume, init_tata, prenume "
                + "FROM candidat "
                + "WHERE upper(nume) like upper('%" + input + "%') "
                + "OR upper(prenume) like upper('%" + input + "%') "
                + "ORDER BY cod_c";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                numeCompletCandidati.add(result.getString("nume") + " " + result.getString("init_tata") + ". " + result.getString("prenume"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return numeCompletCandidati;
    }

    public static List<String> getCNPCandidat(String input) {

        List<String> cnpCandidati = new ArrayList<>();

        String query
                = "SELECT cnp "
                + "FROM candidat "
                + "WHERE upper(nume) like upper('%" + input + "%')"
                + "OR upper(prenume) like upper('%" + input + "%') "
                + "ORDER BY cod_c";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                cnpCandidati.add(result.getString("cnp"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return cnpCandidati;
    }

    public static String getNumeCandidat(int cod_c) {

        String numeCandidat;
        numeCandidat = null;

        String query
                = "SELECT nume "
                + "FROM candidat "
                + "WHERE cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                numeCandidat = result.getString("nume");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return numeCandidat;
    }

    public static String getInitialaTataCandidat(int cod_c) {

        String init_tata;
        init_tata = null;

        String query
                = "SELECT init_tata "
                + "FROM candidat "
                + "WHERE cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                init_tata = result.getString("init_tata");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return init_tata;
    }

    public static String getPrenumeCandidat(int cod_c) {

        String prenume;
        prenume = null;

        String query
                = "SELECT prenume "
                + "FROM candidat "
                + "WHERE cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                prenume = result.getString("prenume");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return prenume;
    }

    public static String getDataNastereCandidat(int input) {

        String data_n;
        data_n = null;

        String query
                = "SELECT data_n "
                + "FROM candidat "
                + "WHERE cod_c = " + input;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                data_n = result.getString("data_n");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return data_n;
    }

    public static String getLiceuCandidat(int input) {

        String den_liceu;
        den_liceu = null;

        String query
                = "SELECT den_liceu "
                + "FROM candidat "
                + "WHERE cod_c = " + input;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                den_liceu = result.getString("den_liceu");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return den_liceu;
    }

    public static double getMedieLiceuCandidat(int cod_c) {

        double medie_liceu;
        medie_liceu = 0;

        String query
                = "SELECT medie_liceu "
                + "FROM candidat "
                + "WHERE cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                medie_liceu = result.getDouble("medie_liceu");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return medie_liceu;
    }

    public static double getMedieBacCandidat(int cod_c) {

        double medie_bac;
        medie_bac = 0;

        String query
                = "SELECT medie_bac "
                + "FROM candidat "
                + "WHERE cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                medie_bac = result.getDouble("medie_bac");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return medie_bac;
    }

    public static List<Integer> getCodExamenCandidat(int input) {

        List<Integer> codExamenCandidati = new ArrayList<>();

        String query
                = "SELECT distinct regula_admitere.cod_e "
                + "FROM optiune_candidat, specializare, regula_admitere, examen "
                + "WHERE optiune_candidat.cod_s = specializare.cod_s "
                + "AND regula_admitere.cod_r = specializare.cod_r "
                + "AND examen.cod_e = regula_admitere.cod_e "
                + "AND cod_c = " + input;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                codExamenCandidati.add(result.getInt("cod_e"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return codExamenCandidati;
    }

    public static List<String> getDenumireExamenCandidat(int input) {

        List<String> denumireExamenCandidati = new ArrayList<>();

        String query
                = "SELECT distinct den_e "
                + "FROM optiune_candidat, specializare, regula_admitere, examen "
                + "WHERE optiune_candidat.cod_s = specializare.cod_s "
                + "AND regula_admitere.cod_r = specializare.cod_r "
                + "AND examen.cod_e = regula_admitere.cod_e "
                + "AND cod_c = " + input;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                denumireExamenCandidati.add(result.getString("den_e"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return denumireExamenCandidati;
    }

    public static List<Double> getNotaExamenCandidat(int input) {

        List<Double> notaExamenCandidati = new ArrayList<>();

        String query
                = "SELECT nota "
                + "FROM candidat, rezultat, examen "
                + "WHERE candidat.cod_c = rezultat.cod_c "
                + "AND examen.cod_e = rezultat.cod_e "
                + "AND examen.cod_e in ("
                + "SELECT distinct regula_admitere.cod_e "
                + "FROM optiune_candidat, specializare, regula_admitere, examen "
                + "WHERE optiune_candidat.cod_s = specializare.cod_s "
                + "AND regula_admitere.cod_r = specializare.cod_r "
                + "AND examen.cod_e = regula_admitere.cod_e "
                + "AND optiune_candidat.cod_c = " + input + ") "
                + "AND candidat.cod_c = " + input;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                notaExamenCandidati.add(result.getDouble("nota"));
            }
        } catch (SQLException e) {

            closeConnection(connection);

        }

        return notaExamenCandidati;
    }

    public static double getNotaExamenCandidat(String den_s, int cod_c) {

        double notaExamenCandidat = -1;

        String query
                = "SELECT nota "
                + "FROM rezultat "
                + "WHERE cod_e = ("
                + "SELECT cod_e "
                + "FROM specializare, regula_admitere "
                + "WHERE specializare.cod_r = regula_admitere.cod_r "
                + "AND den_s = '" + den_s + "') "
                + "AND cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                notaExamenCandidat = result.getDouble("nota");
            }
        } catch (SQLException e) {

            closeConnection(connection);

        }

        return notaExamenCandidat;
    }

    public static List<String> getLocatieExamenCandidat(int input) {

        List<String> locatieExamenCandidati = new ArrayList<>();

        String query
                = "SELECT distinct locatie "
                + "FROM optiune_candidat, specializare, regula_admitere, examen "
                + "WHERE optiune_candidat.cod_s = specializare.cod_s "
                + "AND regula_admitere.cod_r = specializare.cod_r "
                + "AND examen.cod_e = regula_admitere.cod_e "
                + "AND cod_c = " + input;
        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                locatieExamenCandidati.add(result.getString("locatie"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return locatieExamenCandidati;
    }

    public static List<String> getDataExamenCandidat(int input) {

        List<String> dataExamenCandidati = new ArrayList<>();

        String query
                = "SELECT distinct data "
                + "FROM optiune_candidat, specializare, regula_admitere, examen "
                + "WHERE optiune_candidat.cod_s = specializare.cod_s "
                + "AND regula_admitere.cod_r = specializare.cod_r "
                + "AND examen.cod_e = regula_admitere.cod_e "
                + "AND cod_c = " + input;
        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                dataExamenCandidati.add(result.getString("data"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return dataExamenCandidati;
    }

    public static int getCodCandidat(String input) {

        int cod_c;
        cod_c = 0;

        String query
                = "SELECT cod_c "
                + "FROM candidat "
                + "WHERE cnp = '" + input + "' "
                + "ORDER BY cod_c";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                cod_c = result.getInt("cod_c");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return cod_c;
    }

    public static List<Integer> getCodCandidat() {

        List<Integer> coduriCandidat = new ArrayList<>();

        String query
                = "SELECT cod_c "
                + "FROM candidat "
                + "ORDER BY cod_c";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                coduriCandidat.add(result.getInt("cod_c"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return coduriCandidat;
    }

    public static List<Integer> getCodSpecializareOfOptiuneCandidat(int cod_c) {

        List<Integer> codSpecializareOfOptiuneCandidat = new ArrayList<>();

        String query
                = "SELECT specializare.cod_s "
                + "FROM specializare, optiune_candidat "
                + "WHERE optiune_candidat.cod_s = specializare.cod_s "
                + "AND cod_c = " + cod_c + " "
                + "ORDER BY cod_o";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                codSpecializareOfOptiuneCandidat.add(result.getInt("cod_s"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return codSpecializareOfOptiuneCandidat;
    }

    public static List<String> getLiceu() {

        List<String> licee = new ArrayList<>();

        String query
                = "SELECT DISTINCT den_liceu "
                + "FROM candidat ";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                licee.add(result.getString("den_liceu"));

            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return licee;
    }

    public static List<String> getLiceuCandidat(String input) {

        List<String> liceu = new ArrayList<>();

        String query
                = "SELECT den_liceu "
                + "FROM candidat "
                + "WHERE upper(nume) like upper('%" + input + "%')"
                + "OR upper(prenume) like upper('%" + input + "%') "
                + "ORDER BY cod_c";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                liceu.add(result.getString("den_liceu"));

            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return liceu;
    }

    public static List<Double> getMedieLiceuCandidat(String input) {

        List<Double> medie_liceu = new ArrayList<>();

        String query
                = "SELECT medie_liceu "
                + "FROM candidat "
                + "WHERE upper(nume) like upper('%" + input + "%')"
                + "OR upper(prenume) like upper('%" + input + "%') "
                + "ORDER BY cod_c";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                medie_liceu.add(result.getDouble("medie_liceu"));

            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return medie_liceu;
    }

    public static List<Double> getMedieBacCandidat(String input) {

        List<Double> medie_bac = new ArrayList<>();

        String query
                = "SELECT medie_bac "
                + "FROM candidat "
                + "WHERE upper(nume) like upper('%" + input + "%')"
                + "OR upper(prenume) like upper('%" + input + "%') "
                + "ORDER BY cod_c";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                medie_bac.add(result.getDouble("medie_bac"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);
        return medie_bac;
    }

    public static void updateCandidat(
            int cod_c,
            String nume,
            String init_tata,
            String prenume,
            String cnp,
            String data_n,
            String den_liceu,
            double medie_liceu,
            double medie_bac) {

        String query
                = "UPDATE candidat "
                + "SET nume = '" + nume + "', "
                + "init_tata = '" + init_tata + "', "
                + "prenume = '" + prenume + "', "
                + "cnp = '" + cnp + "', "
                + "data_n = TO_DATE ('" + data_n + "', 'YYYY-MM-DD'), "
                + "den_liceu = '" + den_liceu + "', "
                + "medie_liceu = " + medie_liceu + ", "
                + "medie_bac = " + medie_bac + " "
                + "WHERE cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        executeQuery(connection, query);

        closeConnection(connection);
    }

    public static void updateNotaRezultat(
            int cod_c,
            int cod_e,
            double nota) {

        String query
                = "UPDATE rezultat "
                + "SET nota = " + nota + " "
                + "WHERE cod_c = " + cod_c + " "
                + "AND cod_e = " + cod_e;

        Connection connection = null;
        connection = openConnection(connection);
        executeQuery(connection, query);

        closeConnection(connection);
    }

    public static boolean hasDuplicateCandidat(String input) {

        String duplicates = null;

        String query
                = "SELECT cnp "
                + "FROM candidat "
                + "WHERE cnp = '" + input + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                duplicates = result.getString("cnp");
            }

        } catch (SQLException e) {
        }

        closeConnection(connection);

        return !(duplicates == null);
    }

    public static String getFirstname(String username) {

        String firstname = null;

        String query
                = "SELECT firstname "
                + "FROM users "
                + "WHERE username = '" + username + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                firstname = result.getString("firstname");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return firstname;
    }

    public static String getLastname(String username) {

        String lastname = null;

        String query
                = "SELECT lastname "
                + "FROM users "
                + "WHERE username = '" + username + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                lastname = result.getString("lastname");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return lastname;
    }

    public static String getPassword(String username) {

        String password = null;

        String query
                = "SELECT password "
                + "FROM users "
                + "WHERE username = '" + username + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                password = result.getString("password");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return password;
    }

    public static void insertIntoCandidat(
            int cod_c,
            String nume,
            String initTata,
            String prenume,
            String cnp,
            String dataNastere,
            String liceu,
            double medieLiceu,
            double medieBac) {

        String query;
        query = "INSERT INTO candidat "
                + "VALUES "
                + "(" + cod_c + ", "
                + "'" + nume + "', "
                + "'" + initTata + "', "
                + "'" + prenume + "', "
                + "'" + cnp + "', "
                + "TO_DATE ('" + dataNastere + "', 'YYYY-MM-DD'), "
                + "'" + liceu + "', "
                + medieLiceu + ", "
                + medieBac + ")";

        Connection connection = null;
        connection = openConnection(connection);
        executeQuery(connection, query);

        closeConnection(connection);

    }

    public static void insertIntoOptiuneCandidat(
            int cod_o,
            String forma_finantare,
            int cod_c,
            int cod_s) {

        String query;
        query = "INSERT INTO optiune_candidat "
                + "VALUES "
                + "(" + cod_o + ", "
                + "'" + forma_finantare + "', "
                + cod_c + ", "
                + cod_s + ")";

        Connection connection = null;
        connection = openConnection(connection);
        executeQuery(connection, query);

        closeConnection(connection);

    }

    public static void insertIntoRezultat(
            int cod_c,
            int cod_e,
            double nota) {

        String query;
        query = "INSERT INTO rezultat "
                + "VALUES "
                + "(" + cod_c + ", "
                + cod_e + ", "
                + nota + ")";

        Connection connection = null;
        connection = openConnection(connection);
        executeQuery(connection, query);

        closeConnection(connection);

    }

    public static void deleteCandidat(int cod_c) {

        String query;
        query
                = "DELETE FROM rezultat "
                + "WHERE cod_c = " + cod_c;

        Connection connection = null;
        connection = openConnection(connection);
        executeQuery(connection, query);

        query
                = "DELETE FROM optiune_candidat "
                + "WHERE cod_c = " + cod_c;

        executeQuery(connection, query);

        query
                = "DELETE FROM candidat "
                + "WHERE cod_c = " + cod_c;

        executeQuery(connection, query);

        closeConnection(connection);

    }

    public static int getNextCodCandidat() {
        int cod_c;
        cod_c = 0;

        String query
                = "SELECT max(cod_c) "
                + "FROM candidat";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                cod_c = result.getInt("max(cod_c)") + 1;
            }
        } catch (NullPointerException e) {
            cod_c = 10001;
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return cod_c;
    }

    public static int getNextCodOptiune() {
        int cod_o;
        cod_o = -1;

        String query
                = "SELECT max(cod_o) "
                + "FROM optiune_candidat ";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                cod_o = result.getInt("max(cod_o)") + 1;
            }
        } catch (NullPointerException e) {
            cod_o = 100001;
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return cod_o;
    }

    public static int getCodSpecializare(String input) {
        int cod_s;
        cod_s = 0;

        String query
                = "SELECT cod_s "
                + "FROM specializare "
                + "WHERE den_s = '" + input + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                cod_s = result.getInt("cod_s");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return cod_s;
    }

    public static List<Integer> getCodSpecializare() {
        List<Integer> cod_s = new ArrayList<>();

        String query
                = "SELECT cod_s "
                + "FROM specializare "
                + "ORDER BY cod_s";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                cod_s.add(result.getInt("cod_s"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return cod_s;
    }

    public static List<Integer> getCodOptiuneCandidat(int cod_c) {
        List<Integer> cod_o = new ArrayList<>();

        String query
                = "SELECT cod_o "
                + "FROM optiune_candidat "
                + "WHERE cod_c = " + cod_c + " "
                + "ORDER BY cod_o";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                cod_o.add(result.getInt("cod_o"));
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return cod_o;
    }

    public static String getDenumireRegulaAdmitereSpecializare(String den_s) {
        String descriere = null;

        String query
                = "SELECT descriere "
                + "FROM specializare, regula_admitere "
                + "WHERE specializare.cod_r = regula_admitere.cod_r "
                + "AND den_s = '" + den_s + "'";

        Connection connection = null;
        connection = openConnection(connection);
        ResultSet result = executeQuery(connection, query);

        try {
            while (result.next()) {
                descriere = result.getString("descriere");
            }
        } catch (SQLException e) {
        }

        closeConnection(connection);

        return descriere;
    }

    // </editor-fold>
}
