package question2;

public class ProxyVaultAccess extends AbstractVaultAccess  {
    private AbstractVaultAccess proxyVaultAccess = new RealVaultAccess();


    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        if(key.equals("vault_key") && password.equals("vault_password")){
            return proxyVaultAccess.accessVault(key, fingerprint, password, eyeScanner);
        }else{
            return "access_denied";
        }
    }
}
