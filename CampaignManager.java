public class CampaignManager implements CampaignService{
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignCode()+ " kodlu " + campaign.getCampaignName() +" isimli "+ campaign.getCampaignDescription() + " oyunu eklendi");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignCode()+ " kodlu " + campaign.getCampaignName() +" isimli "+ campaign.getCampaignDescription() + " oyunu güncellendi");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignCode()+ " kodlu " + campaign.getCampaignName() +" isimli "+ campaign.getCampaignDescription() + " oyunu silindi");
    }
}
