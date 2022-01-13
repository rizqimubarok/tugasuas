package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Semut;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan(ctx.getString(R.string.mas_koki_nama),ctx.getString(R.string.mas_koki_asal),
                ctx.getString(R.string.mas_koki_deskripsi),R.drawable.ikan_mas_koki));
        ikans.add(new Ikan(ctx.getString(R.string.guppy_nama),ctx.getString(R.string.guppy_asal),
                ctx.getString(R.string.guppy_deskripsi), R.drawable.ikan_guppy));
        ikans.add(new Ikan(ctx.getString(R.string.cupang_nama),ctx.getString(R.string.cupang_asal),
                ctx.getString(R.string.cupang_deskripsi), R.drawable.ikan_cupang));
        ikans.add(new Ikan(ctx.getString(R.string.molly_nama),ctx.getString(R.string.molly_asal),
                ctx.getString(R.string.molly_deskripsi), R.drawable.ikan_moly));
        ikans.add(new Ikan(ctx.getString(R.string.neon_sutra_nama),ctx.getString(R.string.neon_sutra_asal),
                ctx.getString(R.string.neon_sutra_deskripsi) , R.drawable.ikan_neon_tetra));
        ikans.add(new Ikan(ctx.getString(R.string.zebra_nama),ctx.getString(R.string.zebra_asal),
                ctx.getString(R.string.zebra_deskripsi), R.drawable.ikan_zebra));
        return ikans;
    }

    private static List<Semut> initDataSemut(Context ctx) {
        List<Semut> semuts = new ArrayList<>();
        semuts.add(new Semut(ctx.getString(R.string.ochetellus_nama),ctx.getString(R.string.ochetellus_asal),
                ctx.getString(R.string.ochetellus_deskripsi), R.drawable.semut_ochetellus));
        semuts.add(new Semut(ctx.getString(R.string.solenopsis_spp_nama),ctx.getString(R.string.solenopsis_spp_asal),
                ctx.getString(R.string.solenopsis_spp_deskripsi), R.drawable.semut_solenopsis_spp));
        semuts.add(new Semut(ctx.getString(R.string.tapinoma_melanocephalum_nama),ctx.getString(R.string.tapinoma_melanocephalum_asal),
                ctx.getString(R.string.tapinoma_melanocephalum_deskripsi), R.drawable.semut_tapinoma_melanocephalum));
        semuts.add(new Semut(ctx.getString(R.string.tapinoma_melanocephalum_nama),ctx.getString(R.string.tapinoma_melanocephalum_asal),
                ctx.getString(R.string.tapinoma_melanocephalum_deskripsi), R.drawable.semut_tapinoma_sessile));
        semuts.add(new Semut(ctx.getString(R.string.monomorium_pharaonis_nama),ctx.getString(R.string.monomorium_pharaonis_asal),
                ctx.getString(R.string.monomorium_pharaonis_deskripsi), R.drawable.semut_monomorium_pharaonis));
        semuts.add(new Semut(ctx.getString(R.string.camponotus_ennsylvanicus_nama),ctx.getString(R.string.camponotus_pennsylvanicus_asal),
                ctx.getString(R.string.camponotus_pennsylvanicus_deskripsi), R.drawable.semut_componotus_pennsylvanicus));
        return semuts;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.netherland_dwarf_nama),ctx.getString(R.string.netherland_dwarf_asal),
                ctx.getString(R.string.netherland_dwarf_deskripsi), R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.orictolagus_cuniculus_nama),ctx.getString(R.string.orictolagus_cuniculus_asal),
                ctx.getString(R.string.orictolagus_cuniculus_deskripsi), R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci(ctx.getString(R.string.holland_lop_nama),ctx.getString(R.string.holland_lop_asal),
                ctx.getString(R.string.holland_lop_deskripsi), R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_lop_nama),ctx.getString(R.string.mini_lop_asal),
                ctx.getString(R.string.mini_lop_deskripsi), R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.raksasa_nama),ctx.getString(R.string.raksasa_asal),
                ctx.getString(R.string.raksasa_deskripsi), R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci(ctx.getString(R.string.rex_nama),ctx.getString(R.string.rex_asal),
                ctx.getString(R.string.rex_deskripsi), R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataIkan(ctx));
        hewans.addAll(initDataSemut(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
